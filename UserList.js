import React, {useEffect, useState} from "react";
import UserService from "../services/UserService";

function UserList(){

    const [users,setUsers] = useState([]);
    const [keyword,setKeyword] = useState("");

    useEffect(()=>{
        loadUsers();
    },[])

    const loadUsers = ()=>{
        UserService.getUsers().then((res)=>{
            setUsers(res.data);
        })
    }

    const searchUser = ()=>{
        if(keyword===""){
            loadUsers();
        }else{
            UserService.searchUsers(keyword).then((res)=>{
                setUsers(res.data);
            })
        }
    }

    const deleteUser = (id)=>{
        UserService.deleteUser(id).then(()=>{
            loadUsers();
        })
    }

    return(

        <div className="container mt-5">

            <h2 className="text-center mb-4">User Management System</h2>

            <div className="row mb-3">

                <div className="col-md-8">
                    <input
                    type="text"
                    className="form-control"
                    placeholder="Search by name or address"
                    value={keyword}
                    onChange={(e)=>setKeyword(e.target.value)}
                    />
                </div>

                <div className="col-md-4">
                    <button className="btn btn-primary w-100"
                    onClick={searchUser}>
                    Search
                    </button>
                </div>

            </div>

            <table className="table table-bordered table-hover">

                <thead className="table-dark">
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Address</th>
                        <th>Email</th>
                        <th>Action</th>
                    </tr>
                </thead>

                <tbody>

                {
                    users.map((user)=>(
                        <tr key={user.userID}>

                            <td>{user.userID}</td>
                            <td>{user.userName}</td>
                            <td>{user.userAddress}</td>
                            <td>{user.userEmailId}</td>

                            <td>
                                <button
                                className="btn btn-danger"
                                onClick={()=>deleteUser(user.userID)}>
                                Delete
                                </button>
                            </td>

                        </tr>
                    ))
                }

                </tbody>

            </table>

        </div>

    )
}

export default UserList;