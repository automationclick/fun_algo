package mytree;

public class MyTree 
{
	int data;
	MyTree right;
	MyTree left;

	/**
	 * to get left node
	 * @return 
	 */
	public MyTree(int data) {
		this.right = null;
		this.left = null;

	} 

	public MyTree getLeft()
	{
		return this.left;
	}

	/**
	 * to get right node
	 */

	public MyTree getRight()
	{
		return this.right;
	}

	/**
	 * to set right node's value
	 */

	public void setRight(MyTree node)
	{
		this.right = node;
	}

	/**
	 * to set left node for a root
	 */
	public void setLeft(MyTree node)
	{
		this.left = left;	 
	}

	/**
	 * to get node data
	 */

	public int getData()
	{
		return this.data;
	}

}
