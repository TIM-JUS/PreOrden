/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.preorden;

/**
 *
 * @author Hid Kel
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class TreeTraversal {
    // Recorrido en preorden: raíz, izquierda, derecha
    public void preOrderTraversal(TreeNode node) {
        if (node != null) {
            System.out.print(node.val + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    // Recorrido en inorden: izquierda, raíz, derecha
    public void inOrderTraversal(TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.val + " ");
            inOrderTraversal(node.right);
        }
    }

    // Recorrido en postorden: izquierda, derecha, raíz
    public void postOrderTraversal(TreeNode node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.val + " ");
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        TreeTraversal traversal = new TreeTraversal();
        System.out.println("||||||BIENBENIDO A MI PROGRAMA|||||");
        System.out.println("*PROGRAMADO POR KENYI TIMOTEO JUSTO*\n");
        
        System.out.print("RECORRIDO EN PRE-ORDEN: ");
        traversal.preOrderTraversal(root);
        System.out.println();

        System.out.print("RECORRIDO EN INORDEN: ");
        traversal.inOrderTraversal(root);
        System.out.println();

        System.out.print("RECORRIDO EN POSTORDEN: ");
        traversal.postOrderTraversal(root);
        System.out.println();
    }
}
