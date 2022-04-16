package dyds.act2.parte2;

public class Manager {

	private final ClubRepository repo;
	
	public Manager(ClubRepository repo) {
		super();
		this.repo = repo;
	}

	public Club get(int id) {
		
		Club club =  repo.getFilmLocalSource().getClub(id);

		if(notLocallySaved(club) || tooOld(club)){
			//Replace these lines with calls to parte1 module, when they decide to finish it TODO
			club = repo.getFilmRemoteSource().get(id);
			repo.getFilmLocalSource().storeClub(club);
		}

		/*
		// If it's not locally saved or too old, fetch it from remote and save it locally
		if(club == null || System.currentTimeMillis() - club.getLocalRepoTimeStamp() > ClubRepository.tiempoMaximoEnDiasRepositorioLocal * 24 * 60 * 1000) {
			//Replace these lines with calls to parte1 module, when they decide to finish it
			club = repo.getFilmRemoteSource().get(id);
			repo.getFilmLocalSource().storeClub(club);
		}
		*/
		return club;
	}

	private boolean notLocallySaved(Club club){
		return club == null;
	}

	private boolean tooOld(Club club){
		return (System.currentTimeMillis() - club.getLocalRepoTimeStamp() > ClubRepository.tiempoMaximoEnDiasRepositorioLocal * 24 * 60 * 1000);
	}
}
