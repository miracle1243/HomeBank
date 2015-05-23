package yao.homebank.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TreeNode implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String text;
	private Attributes attributes;
	private String parentId;
	private List<TreeNode> children;
	
	public TreeNode(){
		
	}
	
	public TreeNode(Integer id, String text, String url, Integer parentId) {
		this.id = id.toString();
		this.text = text;
		this.attributes = new Attributes();
		this.attributes.setUrl(url);
		this.parentId = parentId.toString();
	}
	
	public void addChild(TreeNode child) {
		if (this.children == null) {
			this.children = new ArrayList<TreeNode>();
		}
		this.children.add(child);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Attributes getAttributes() {
		return attributes;
	}

	public void setAttributes(Attributes attributes) {
		this.attributes = attributes;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public List<TreeNode> getChildren() {
		return children;
	}

	public void setChildren(List<TreeNode> children) {
		this.children = children;
	}
	
	
}
