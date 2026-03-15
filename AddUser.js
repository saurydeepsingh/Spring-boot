import React,{useState} from "react";
import UserService from "../services/UserService";

function AddUser(){

    const [user,setUser] = useState({
        userID:"",
        userName:"",
        userAddress:"",
        userEmailId:"",
        password:""
    })

    const handleChange = (e)=>{
        setUser({...user,[e.target.name]:e.target.value})
    }

    const saveUser = (e)=>{
        e.preventDefault();
        UserService.addUser(user).then(()=>{
            alert("User Added Successfully");
        })
    }

    return(

        <div className="container mt-5">

            <h3>Add User</h3>

            <form>

                <input className="form-control mb-2"
                name="userID"
                placeholder="User ID"
                onChange={handleChange}/>

                <input className="form-control mb-2"
                name="userName"
                placeholder="User Name"
                onChange={handleChange}/>

                <input className="form-control mb-2"
                name="userAddress"
                placeholder="User Address"
                onChange={handleChange}/>

                <input className="form-control mb-2"
                name="userEmailId"
                placeholder="User Email"
                onChange={handleChange}/>

                <input className="form-control mb-2"
                name="password"
                placeholder="Password"
                onChange={handleChange}/>

                <button className="btn btn-success"
                onClick={saveUser}>
                Save User
                </button>

            </form>

        </div>

    )
}

export default AddUser;