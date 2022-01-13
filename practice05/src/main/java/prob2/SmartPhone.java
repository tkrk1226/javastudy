package prob2;

public class SmartPhone extends MusicPhone {

	@Override
	public void execute(String function) {
		if ("음악".equals(function)) {
			this.playMusic();
		} else if ("통화".equals(function)) {
			super.execute(function);
		} else if ("앱".equals(function)) {
			this.playApp();
		}

	}

	private void playMusic() {
		System.out.println("다운로드해서 음악재생");
	}

	private void playApp() {
		System.out.println("앱실행");
	}

}
