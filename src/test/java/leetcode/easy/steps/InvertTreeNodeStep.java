package leetcode.easy.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import leetcode.easy.InvertBinaryTree;

import static org.junit.Assert.assertArrayEquals;

public class InvertTreeNodeStep {
    private int[] inputRoot;
    private int[] invertedResult;
    private final InvertBinaryTree invertBinaryTree = new InvertBinaryTree();

    @Given("root tree is {}")
    public void root_tree_is_(int[] arr) {
        this.inputRoot = arr;
    }

    @When("do inverting binary tree")
    public void do_inverting_binary_tree() {
        this.invertedResult = invertBinaryTree.invertTree();
    }

    @Then("result should be {}")
    public void result_should_be() {
        assertArrayEquals(invertedResult, inputRoot);
    }
}
