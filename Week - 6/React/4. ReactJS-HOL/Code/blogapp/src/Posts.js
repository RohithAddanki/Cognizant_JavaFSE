import React from 'react';
import Post from './Post';

class Posts extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      hasError: false,
    };
  }

  loadPosts() {
    const customPosts = [
      new Post(
        1,
        "Getting Started with React",
        "React is a powerful JavaScript library used to build user interfaces. This blog explains the basics of setting up a React project."
      ),
      new Post(
        2,
        "Understanding Props and State",
        "In React, props allow data to be passed from parent to child, while state manages internal component data."
      ),
      new Post(
        3,
        "React Lifecycle Methods",
        "React class components go through lifecycle stages. componentDidMount is used for data fetching and initialization."
      ),
      new Post(
        4,
        "Handling Errors with componentDidCatch",
        "componentDidCatch is a lifecycle hook used to catch runtime rendering errors and gracefully display fallback UI."
      ),
      new Post(
        5,
        "Building a Blog Application in React",
        "Learn how to structure your React app into reusable components like Posts and Post, with data rendered dynamically."
      ),
    ];

    this.setState({ posts: customPosts });
  }

  componentDidMount() {
    this.loadPosts();
  }

  componentDidCatch(error, info) {
    alert("An error occurred while rendering posts.");
    console.error("Error caught in componentDidCatch:", error, info);
  }

  render() {
    const { posts, hasError } = this.state;

    if (hasError) {
      return <h2>Something went wrong while loading blog posts.</h2>;
    }

    return (
      <div style={{ width: '80%', margin: 'auto' }}>
        <h2>📝 Blog Posts</h2>
        {posts.map(post => (
          <div
            key={post.id}
            style={{
              border: '1px solid #ccc',
              padding: '10px',
              marginBottom: '15px',
              borderRadius: '5px',
              backgroundColor: '#f9f9f9',
            }}
          >
            <h3>{post.title}</h3>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }
}

export default Posts;