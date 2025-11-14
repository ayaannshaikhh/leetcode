/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */

void preorderHelper(struct TreeNode* root, int* arr, int* index) {
    if (root == NULL) return;

    arr[*index] = root->val;
    (*index)++;

    preorderHelper(root->left, arr, index);
    preorderHelper(root->right, arr, index);
}

int* preorderTraversal(struct TreeNode* root, int* returnSize) {
    int* result = malloc(sizeof(int) * 200); 
    int index = 0;

    preorderHelper(root, result, &index);

    *returnSize = index;
    return result;
}