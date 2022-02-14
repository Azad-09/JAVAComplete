import java.util.Scanner;

public class BST {
	
	Node root,parent;
	
	public BST()
	{
		root=parent=null;
	}
	
	public boolean searchNode(int data)
	{
		return true;
	}
	
	public boolean search(int data)
	{
		Node temp;
		temp=root;
			while(temp!=null)
			{
				if(temp.getData()==data){
					return true;
				}
				else if(temp.getData()>data){
					parent=temp;
					temp=temp.left;
				}
				else{
					parent=temp;
					temp=temp.right;
				}
			}
		return false;
	}
	
	public void inOrder(Node temp)
	{
		if(temp!=null)
		{
			inOrder(temp.left);
			System.out.print(temp.getData()+"\t");
			inOrder(temp.right);
		}
	}
	public void preOrder(Node temp)
	{
		if(temp!=null)
		{
			System.out.print(temp.getData()+"\t");
			preOrder(temp.left);	
			preOrder(temp.right);
		}
	}
	public void postOrder(Node temp)
	{
		if(temp!=null)
		{
			postOrder(temp.left);
			postOrder(temp.right);
			System.out.print(temp.getData()+"\t");
		}
	}
	
	public Node searchForDeletion(int deleteValue)
	{
		Node temp;
		temp=root;
			while(temp!=null)
			{
				if(temp.getData()==deleteValue){
					return temp;
				}
				else if(temp.getData()>deleteValue){
					parent=temp;
					temp=temp.left;
				}
				else{
					parent=temp;
					temp=temp.right;
				}
			}
		return temp;
	}
	
	public void delete()
	{
		int deleteValue;
		Scanner scannerObj=new Scanner(System.in);
		System.out.println("Enter the Value to be Deleted:");
		deleteValue=scannerObj.nextInt();
		Node currentNode=null;
		currentNode=searchForDeletion(deleteValue);
		
		if(currentNode==null)
		{
			System.out.println("There are no node with the Value Exist");
			return;
		}
		
		if(currentNode.left==null && currentNode.right==null)
		{
			if(parent.left==currentNode)
				parent.left=null;
			else
				parent.right=null;
			
			currentNode=null;
			return;
		}
		
		if(currentNode.left!=null && currentNode.right==null)
		{
			if(parent.left==currentNode)
				parent.left=currentNode.left;
			else
				parent.right=currentNode.left;
			
			currentNode=null;
			return;
		}
		if(currentNode.left==null && currentNode.right!=null)
		{
			if(parent.left==currentNode)
				parent.left=currentNode.right;
			else
				parent.right=currentNode.right;
			
			currentNode=null;
			return;
		}
		
		if(currentNode.left!=null && currentNode.right!=null)
		{
				Node temp;
				temp=currentNode.right;
				while(temp.left!=null)
				{
					parent=temp;
					temp=temp.left;
				}
				currentNode.data=temp.data;
				parent.left=null;
				temp=null;
				return;
		}
	}
	
	public void insertElement()
	{
		int data;
		
		Scanner scannerObj=new Scanner(System.in);
		System.out.println("Enter the Value of Node:");
		data=scannerObj.nextInt();
		Node newNode=new Node(data);
		
		if(root==null) {	
			root=newNode;
		}
		else
		{
			boolean exist=search(data);
			if(exist){
				System.out.println("Such Node Exist:");
				return;
			}
			if(parent.getData()>data){
				parent.left=newNode;
			}
			else{
				parent.right=newNode;
			}
		}
	}

}
