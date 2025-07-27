// src/Post.js
import React from "react";

class Post extends React.Component {
  render() {
    return (
      <div style={{ border: "1px solid gray", padding: "10px", margin: "10px 0" }}>
        <h2>{this.props.title}</h2>
        <p>{this.props.body}</p>
      </div>
    );
  }
}

export default Post;
