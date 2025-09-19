import axios from "axios";

const API_URL = "https://api.placeholder.com";

export const getProducts = () => axios.get(`${API_URL}/products`);
