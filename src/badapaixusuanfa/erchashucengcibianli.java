package badapaixusuanfa;

import java.util.*;

import com.fws.niukewang.TreeNode;
public class erchashucengcibianli {
   ArrayList<ArrayList<Integer>> res=new ArrayList();
   public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root){
	   if(root==null)
		   return res;
	  Queue<TreeNode>q=new LinkedList();
	  
	  q.add(root);
	  while(!q.isEmpty()){
		  ArrayList<Integer>list=new ArrayList<>();
		  int count=q.size();
		  while(count>0){
			  TreeNode temp=q.peek();
			  list.add(temp.val);
			  q.poll();
			  count--;
			  if(temp.left!=null)
				  q.add(temp.left);
			  if(temp.right!=null)
				  q.add(temp.right);
			  
		  }
		  res.add(list);
	  }
	return res;
   }
}
