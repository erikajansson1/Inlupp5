public class Item {
	private int volume;

	public Item(int volume) {
		this.volume = volume;
	}

	public int getVolume() {
		return this.volume;
	}


	public class Keychain extends Item {
		private int amount;

		public Keychain(int amount, int volume) {
			super(volume);
			this.amount = amount;
			
		}

		public Keychain(int volume) {
			super(int volume);
			this.amount = 0;
		}

		public int getVolume() {
			return this.volume*this.amount;
		}

		public void incrementAmount() {
			this.amount += 1;
		} 	
	}
}