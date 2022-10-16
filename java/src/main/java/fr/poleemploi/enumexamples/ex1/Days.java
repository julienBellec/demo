package fr.poleemploi.enumexamples.ex1;

public enum Days {

	MONDAY {
		@Override
		public boolean isWeekEnd() {
			return false;
		}
	},
	THUESDAY {
		@Override
		public boolean isWeekEnd() {
			return false;
		}
	},
	WEDNESDAY {
		@Override
		public boolean isWeekEnd() {
			return false;
		}
	},
	THURSDAY {
		@Override
		public boolean isWeekEnd() {
			return false;
		}
	},
	FRIDAY {
		@Override
		public boolean isWeekEnd() {
			return false;
		}
	},
	SATURDAY {
		@Override
		public boolean isWeekEnd() {
			return true;
		}
	},
	SUNDAY {
		@Override
		public boolean isWeekEnd() {
			return true;
		}
	};

	public abstract boolean isWeekEnd();
}
