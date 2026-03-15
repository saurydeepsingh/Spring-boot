import axios from "axios";

const API_URL = "http://localhost:8080";

class UserService {

    getUsers(){
        return axios.get(API_URL + "/UserList");
    }

    searchUsers(keyword){
        return axios.get(API_URL + "/UserList/keyword/" + keyword);
    }

    addUser(user){
        return axios.post(API_URL + "/UserList", user);
    }

    deleteUser(id){
        return axios.delete(API_URL + "/UserDelete/" + id);
    }

}

export default new UserService();