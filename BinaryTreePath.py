# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def binaryTreePaths(self, root):
        if not root:
            return []
        
        paths = []
        self._binaryTreePaths(root, "", paths)
        return paths
    
    def _binaryTreePaths(self, node, path, paths):
        if not node:
            return
        
        if not node.left and not node.right:
            paths.append(path + str(node.val))
            return
        
        path += str(node.val) + "->"
        self._binaryTreePaths(node.left, path, paths)
        self._binaryTreePaths(node.right, path, paths)

# Function to build the binary tree from list representation
def build_tree(nodes):
    if not nodes:
        return None
    
    root = TreeNode(nodes[0])
    queue = [root]
    i = 1
    while queue and i < len(nodes):
        current = queue.pop(0)
        if nodes[i] is not None:
            current.left = TreeNode(nodes[i])
            queue.append(current.left)
        i += 1
        if i < len(nodes) and nodes[i] is not None:
            current.right = TreeNode(nodes[i])
            queue.append(current.right)
        i += 1
    return root

# Function to print the output in the required format
def print_output(paths):
    print("Output:")
    for path in paths:
        print(path)

if __name__ == "__main__":
    # Taking input for the binary tree
    nodes = list(map(lambda x: int(x) if x != "null" else None, input("Enter the nodes of the binary tree separated by spaces: ").split()))
    
    # Building the binary tree
    root = build_tree(nodes)
    
    # Finding the root-to-leaf paths
    solution = Solution()
    paths = solution.binaryTreePaths(root)
    
    # Printing the output
    print_output(paths)
