function Dashboard() {

    const token = localStorage.getItem("token");

    if (!token) {
        return <h1>Please login first</h1>;
    }

    return (
        <div>
            <h1>Dashboard Page</h1>
            <p>Protected Route Working!</p>
        </div>
    );
}

export default Dashboard;