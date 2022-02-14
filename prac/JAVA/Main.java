package com.company;

import java.util.Scanner;

public class Main     // **1**
{

    public static void main(String[] args)
    {
	// write your code here
        Scanner sc=new Scanner(System.in);
         BSTProg list = new BSTProg();
                while(true)
                {
                    System.out.println("Select an Choice\n1.Insert\n2.Display\n3.Delete\n4.Search\n5.Exit\nEnter your Choice");
                    int Choice=sc.nextInt();
                    switch(Choice)
                    {
                        case 1: System.out.println("Enter a numbers");
                            sc.nextLine();
                            int num=sc.nextInt();
                            Node n=new Node(num);
                            list.add(num);
                            System.out.println("Insertion Successful");
                            break;
                        case 2:list.display(); break;
                        case 3: sc.nextLine();System.out.println("Enter the number to delete");
                            int num1=sc.nextInt();
                            System.out.println(list.delete(num1));break;
                        case 4: sc.nextLine();System.out.println("Enter Number to Search");
                            String num2=sc.nextLine();
                            //System.out.println(list.search(num2));break;
                        case 5:  System.exit(0);break;
                        default: System.out.println("Invalid choice");
                    }
                }

    }
}


     class Node  // **2**
  {
            int data;
            Node leftChild;
            Node rightChild;
            Node(int data)
        {
            this.data=data;
            leftChild=null;
            rightChild=null;
        }
  }
class BSTProg  // **3**
{
    Node root=null;
    public void add(int data)
    {
        root=addNode(data,root);//root=parent
    }
    private Node addNode(int data,Node parent)
    {
        Node newNode;
        if(parent==null){
            newNode=new Node(data);
            parent=newNode;
        }
        else{
            if(parent.data>data)
                parent.leftChild=addNode(data,parent.leftChild);
            else if(parent.data<data)
                parent.rightChild=addNode(data,parent.rightChild);
            else
                return parent;
        }
        return parent;
    }
    public int delete(int data){
        root=deleteNode(data,root);
        return data;
    }
    private Node deleteNode(int data,Node parent)
    {
        if(parent==null)
        {
            System.out.println("nothing to delete");
            return null;
        }
        else{
            if(parent.data<data)
            {
                parent.rightChild=deleteNode(data,parent.rightChild);
            }
            else if(parent.data>data){
                parent.leftChild=deleteNode(data,parent.leftChild);
            }
            else{

                if(parent.leftChild==null)
                    return parent.rightChild;
                else if(parent.rightChild==null)
                    return parent.leftChild;

                else{

                    parent.rightChild=deleteNode(parent.data,parent.rightChild);
                }

            }
            return parent;
        }
    }
    private int minValue(Node parent)
    {
        int min=root.data;
        while(parent.leftChild!=null)
        {
            min=parent.leftChild.data;
            parent=parent.leftChild;
        }
        return min;
    }
    public void display(){
        inOrderDisplay(root);System.out.println("Your tree:-----------");

    }
    private void inOrderDisplay(Node root)
    {
        if(root!=null)
        {
            inOrderDisplay(root.leftChild);//7  8  9  10  11  12
            System.out.println(root.data);
            inOrderDisplay(root.rightChild);
        }
    }

}