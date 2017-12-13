// C++ program to find if there is a subtree with
// given sum
#include<bits/stdc++.h>
using namespace std;

/* A binary tree node has data, pointer to left child
and a pointer to right child */
struct Node
{
	int data;
	struct Node* left, *right;
};

/* utility that allocates a new node with the
given data and NULL left and right pointers. */
struct Node* newnode(int data)
{
	struct Node* node = new Node;
	node->data = data;
	node->left = node->right = NULL;
	return (node);
}

// function to check if there exist any subtree with given sum
// cur_sum --> sum of current subtree from ptr as root
// sum_left --> sum of left subtree from ptr as root
// sum_right --> sum of right subtree from ptr as root
int sums(struct Node *ptr,int sum)
{
    if(ptr==NULL)
    return 0;
	// base condition
int x=sums(ptr->left,sum);
if(x==1)
return 1;
int y=sums(ptr->right,sum);
if(y==1)
return 1;

	if(x+y+ptr->data>sum)
	return 0;
		if(x+y+ptr->data==sum)
	return 1;
	return(x+y+ptr->data);


}



// driver program to run the case
int main()
{
	struct Node *root = newnode(8);
	root->left = newnode(5);
	root->right = newnode(4);
	root->left->left = newnode(9);
	root->left->right = newnode(7);
	root->left->right->left = newnode(1);
	root->left->right->right = newnode(12);
	root->left->right->right->right = newnode(2);
	root->right->right = newnode(11);
	root->right->right->left = newnode(3);
	int sum = 22;

	if (sums(root,sum))
		cout << "Yes";
	else
		cout << "No";
	return 0;
}
