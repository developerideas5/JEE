
class Tree{

}

public class Chrome extends Tree{

		public static void main(String[] args) {
		new Chrome().go();
	}

		private void go() {
			// TODO Auto-generated method stub
			go2(new Tree(), new Chrome());
			//go2((Chrome) new Tree(),new Chrome());
		}

		private void go2(Tree tree, Chrome chrome) {
			Chrome r2=(Chrome) tree;
			Tree t2=(Tree) chrome;
			
		}

}
