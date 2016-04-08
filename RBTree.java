/**
*
* RBTree
*
* An implementation of a Red Black Tree with
* non-negative, distinct integer keys and values
*
*/

public class RBTree {


/**
  * public class RBNode
  */
 public static class RBNode{
	 	private String val;
	 	private int key;
	 	private RBNode left,right,parent;
	 	private boolean Red;
<<<<<<< HEAD
	 	public RBNode(){
=======
	 	public RBNode()
	 	{
>>>>>>> master
	 		parent=null;
	 		this.val=null;
	 		Red=false;
	 		left=null;
	 		right=null;
	 		this.key=-1;	
	 	}
<<<<<<< HEAD
	 	public RBNode(String val,int key,boolean isRed){
	 		parent = null;
	 		this.val = val;
	 		Red = isRed;
	 		left = null;
	 		right = null;
	 		this.key = key;
	 	}
	 	public void setLeft(RBNode l){
	 		left = l;
	 		if(l != leaf)
	 			l.parent=this;
	 	}
	 	public void setRight(RBNode r){
=======
	 	public RBNode(String val,int key,boolean isRed)
	 	{
	 		parent=null;
	 		this.val=val;
	 		Red=isRed;
	 		left=null;
	 		right=null;
	 		this.key=key;
	 	}
	 	public void setLeft(RBNode l)
	 	{
	 		left=l;
	 		if(l!=leaf)
	 			l.parent=this;
	 	}
	 	public void setRight(RBNode r)
	 	{
>>>>>>> master
	 		right=r;
	 		if(r!=leaf)
	 			r.parent=this;
	 	}
<<<<<<< HEAD
	 	public void setRed(boolean red){
	 		Red=red;
	 	}
	 	public void setVal(String Val){
	 		val=Val;
	 	}
	 	public void setParent(RBNode par){
	 		parent=par;
	 	}
	 	public RBNode getParent(){
	 		return parent;
	 	}
	 	public String getVal(){
=======
	 	public void setRed(boolean red)
	 	{
	 		Red=red;
	 	}
	 	public void setVal(String Val)
	 	{
	 		val=Val;
	 	}
	 	public void setParent(RBNode par)
	 	{
	 		parent=par;
	 	}
	 	public RBNode getParent()
	 	{
	 		return parent;
	 	}
	 	public String getVal()
	 	{
>>>>>>> master
	 		return val;
	 	}
		public boolean isRed(){ return Red;}
		public RBNode getLeft(){return left;}
		public RBNode getRight(){return right;}
		public int getKey()
		{return key;}
		public static RBNode rotateR(RBNode rot)
		{
			if(rot.getLeft()!=null&&rot.getLeft()!=leaf&&rot!=leaf)
			{
				RBNode temp1=rot.getLeft(),temp2=rot,temp3=rot.getParent(),temp4=rot.getLeft().getRight();
				if(temp3!=null)
				{
					if(temp3.getLeft()==rot)
						temp3.setLeft(temp1);
					else
						temp3.setRight(temp1);
				}
				temp1.setParent(temp3);
				temp1.setRight(temp2);
				temp2.setLeft(temp4);
				rot=temp1;
			}
			return rot;
		}
<<<<<<< HEAD
		public static RBNode rotateL(RBNode rot){
			if(rot.getRight()!=null&&rot.getRight()!=leaf&&rot!=leaf){
				RBNode temp1=rot.getRight(),temp2=rot,temp3=rot.getParent(),temp4=rot.getRight().getLeft();
				if(temp3!=null){
=======
		public static RBNode rotateL(RBNode rot)
		{
			if(rot.getRight()!=null&&rot.getRight()!=leaf&&rot!=leaf)
			{
				RBNode temp1=rot.getRight(),temp2=rot,temp3=rot.getParent(),temp4=rot.getRight().getLeft();
				if(temp3!=null)
				{
>>>>>>> master
					if(temp3.getLeft()==rot)
						temp3.setLeft(temp1);
					else
						temp3.setRight(temp1);
				}
				temp1.setParent(temp3);
				temp1.setLeft(temp2);
				temp2.setRight(temp4);
				rot=temp1;
			}
			return rot;
		}
<<<<<<< HEAD
		public boolean isLeftChild(){
=======
		public boolean isLeftChild()
		{
>>>>>>> master
			if(parent==null)
				return false;
			return parent.getLeft()==this;
		}
 }
	private RBNode root;
	private static RBNode leaf=new RBNode();
/**
  * public RBNode getRoot()
  *
  * returns the root of the red black tree
  *
  */
 public RBNode getRoot() {
   if(this==null)
	   return null;
   return root;// to be replaced by student code
 }
 
 /**
  * public boolean empty()
  *
  * returns true if and only if the tree is empty
  *
  */
 public boolean empty() {
   return getRoot()==null; // to be replaced by student code
 }

/**
  * public String search(int k)
  *
  * returns the value of an item with key k if it exists in the tree
  * otherwise, returns null
  */
<<<<<<< HEAD
 public String search(int k){
	if(empty())
		return null;
	RBNode x=getRoot();
	while(x!=null&&x!=leaf){
=======
 public String search(int k)
 {
	if(empty())
		return null;
	RBNode x=getRoot();
	while(x!=null&&x!=leaf)
	{
>>>>>>> master
		if(x.getKey()==k)
			return x.getVal();
		if(k<x.getKey())
			x=x.getLeft();
		else
			x=x.getRight();
	}
	return null;
		
 }

 /**
  * public int insert(int k, String v)
  *
  * inserts an item with key k and value v to the red black tree.
  * the tree must remain valid (keep its invariants).
  * returns the number of color switches, or 0 if no color switches were necessary.
  * returns -1 if an item with key k already exists in the tree.
  */
  public int insert(int k, String v) {
<<<<<<< HEAD
	  if(empty()){
=======
	  if(empty())
	  {
>>>>>>> master
		  
		  root=new RBNode(v,k,true);
		  root.setLeft(leaf);
		  root.setRight(leaf);
		  return fixInsert(root);
	  }
	  RBNode x=this.root;
<<<<<<< HEAD
	  while(true){
		  if(x.key==k)
			  return -1;
		  if(x.key>k){
=======
	  while(true)
	  {
		  if(x.key==k)
			  return -1;
		  if(x.key>k)
		  {
>>>>>>> master
			  if(x.getLeft()==leaf)
				  break;
			  x=x.getLeft();
		  }
<<<<<<< HEAD
		  else{
=======
		  else
		  {
>>>>>>> master
			  if(x.getRight()==leaf)
				  break;
			  x=x.getRight();
		  }
	  }
	  RBNode New=new RBNode(v,k,true);
	  New.setLeft(leaf);
	  New.setRight(leaf);
	  if(k<x.key)
		  x.setLeft(New);
	  else
		  x.setRight(New);
	  return fixInsert(New);
  }
<<<<<<< HEAD
  public int fixInsert(RBNode x){
	  if(x.isRed()){
		  if(x.getParent()==null){
=======
  public int fixInsert(RBNode x)
  {
	  if(x.isRed())
	  {
		  if(x.getParent()==null)
		  {
>>>>>>> master
			  root=x;
			  x.setRed(false);
			  return 1;
		  }
		  if(!x.getParent().isRed())
			  return 0;
		  else
		  {
			  if(x.getParent().isLeftChild())
			  {
				  if(x.getParent().getParent().getRight().isRed())
				  {
					  x.getParent().setRed(false);
					  x.getParent().getParent().setRed(true);
					  x.getParent().getParent().getRight().setRed(false);
					  return 3+fixInsert(x.getParent().getParent());
					  
				  }
				  else
				  {
					  if(!x.isLeftChild())
						  x=RBNode.rotateL(x.getParent());
					  else
						  x=x.getParent();
					  x.setRed(false);
					  x.getParent().setRed(true);
					  x=RBNode.rotateR(x.getParent());
					  if(x.getParent()==null)
					  {
						  root=x;
					  }
					  return 2;
						  
				  }
			  }
			  else
			  {
				  if(x.getParent().getParent().getLeft().isRed())
				  {
					  x.getParent().setRed(false);
					  x.getParent().getParent().setRed(true);
					  x.getParent().getParent().getLeft().setRed(false);
					  return 3+fixInsert(x.getParent().getParent());
					  
				  }
				  else
				  {
					  if(x.isLeftChild())
						  x=RBNode.rotateR(x.getParent());
					  else
						  x=x.getParent();
					  x.setRed(false);
					  x.getParent().setRed(true);
					  x=RBNode.rotateL(x.getParent());
					  if(x.getParent()==null)
					  {
						  root=x;
					  }
					  return 2;
						  
				  }
				  
			  }
		  }
		  
	  }
	  if(x.getParent()==null)
	  {
		  root=x;
	  }
	  return 0;
	  
  }

 /**
  * public int delete(int k)
  *
  * deletes an item with key k from the binary tree, if it is there;
  * the tree must remain valid (keep its invariants).
  * returns the number of color switches, or 0 if no color switches were needed.
  * returns -1 if an item with key k was not found in the tree.
  */
  public int delete(int k)
  {
	   return 42;	// to be replaced by student code
  }

  /**
   * public String min()
   *
   * Returns the value of the item with the smallest key in the tree,
   * or null if the tree is empty
   */
  public String min()
  {
	  if(empty())
		  return null;
	  RBNode x=root;
	  while(x.getLeft()!=leaf)
	  {
		  x=x.getLeft();
	  }
	  return x.getVal();
  }

  /**
   * public String max()
   *
   * Returns the value of the item with the largest key in the tree,
   * or null if the tree is empty
   */
  public String max()
  {
	  if(empty())
		  return null;
	  RBNode x=root;
	  while(x.getRight()!=leaf)
	  {
		  x=x.getRight();
	  }
	  return x.getVal();
  }

 /**
  * public int[] keysToArray()
  *
  * Returns a sorted array which contains all keys in the tree,
  * or an empty array if the tree is empty.
  */
 public int[] keysToArray()
 {
       int[] arr = new int[42]; // to be replaced by student code
       return arr;              // to be replaced by student code
 }

 /**
  * public String[] valuesToArray()
  *
  * Returns an array which contains all values in the tree,
  * sorted by their respective keys,
  * or an empty array if the tree is empty.
  */
 public String[] valuesToArray()
 {
       String[] arr = new String[42]; // to be replaced by student code
       return arr;                    // to be replaced by student code
 }

  /**
   * public int size()
   *
   * Returns the number of nodes in the tree.
   *
   * precondition: none
   * postcondition: none
   */
  public int size()
  {
	   return 42; // to be replaced by student code
  }

/**
   * public int rank(k)
   *
   * Returns the number of nodes in the tree with a key smaller than k.
   *
   * precondition: none
   * postcondition: none
   */
  public int rank(int k)
  {
	   return 42; // to be replaced by student code
  }
  
 
  
/**
  * If you wish to implement classes, other than RBTree and RBNode, do it in this file, not in 
  * another file.
  */
 

}
