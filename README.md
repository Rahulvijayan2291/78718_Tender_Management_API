# Tender Management API – Spring Boot

This project is a REST API service built using Spring Boot for managing bidding details in a tender system. It supports operations for user authentication, bid creation, listing, updating, and deletion with role-based access control implemented using JWT.

---

### Features  

1. **Authentication**  
   - JWT-based authentication and role-based authorization for two roles: *BIDDER* and *APPROVER*.  
   - JWT token is sent as a Bearer token in the Authorization header for secure communication.  

2. **Bid Management**  
   - Add a Bid: Allows bidders to create a new bid.  
   - Update Bid Status: Enables approvers to approve or reject bids.  
   - Retrieve Bids: Fetch bids above a specified amount.  
   - Delete Bid: Allows the creator or approver to remove a bid securely.  

---

### Models  

#### 1. RoleModel  
| Attribute  | Type     | Description                          |  
|------------|----------|--------------------------------------|  
| id         | Integer  | Unique identifier, auto-incremented |  
| rolename   | String   | Role name (e.g., BIDDER, APPROVER)   |  

#### 2. UserModel  
| Attribute    | Type     | Description                          |  
|--------------|----------|--------------------------------------|  
| id           | Integer  | Unique identifier, auto-incremented |  
| username     | String   | Name of the user                    |  
| companyName  | String   | Associated company                  |  
| email        | String   | Unique email                        |  
| password     | String   | Encrypted password                  |  
| role         | Integer  | Foreign key to RoleModel            |  

#### 3. BiddingModel  
| Attribute         | Type     | Description                            |  
|-------------------|----------|----------------------------------------|  
| id                | Integer  | Unique identifier, auto-incremented   |  
| biddingId         | Integer  | Unique identifier for a bid           |  
| projectName       | String   | Fixed project name: "Metro Phase V 2024" |  
| bidAmount         | Double   | Amount of the bid                     |  
| yearsToComplete   | Double   | Estimated completion time in years    |  
| dateOfBidding     | String   | Date in dd/MM/yyyy format             |  
| status            | String   | Default: "pending"                   |  
| bidderId          | Integer  | Foreign key to UserModel for creator  |  

---

### API Endpoints  

1. **Login**  
   - **Endpoint**: `POST /login`  
   - **Request Body**:  
     ```json
     { "email": "user@example.com", "password": "password123" }
     ```  
   - **Response**: JWT token for authorization.  

2. **Add a New Bid**  
   - **Endpoint**: `POST /bidding/add`  
   - **Request Body**:  
     ```json
     { "biddingId": 1001, "bidAmount": 5000000, "yearsToComplete": 2.5 }
     ```  

3. **Retrieve Bids**  
   - **Endpoint**: `GET /bidding/list?bidAmount=1000000`  
   - **Response**: List of bids above the given amount.  

4. **Update Bid Status**  
   - **Endpoint**: `PATCH /bidding/update/{id}`  
   - **Request Body**:  
     ```json
     { "status": "approved" }
     ```  

5. **Delete a Bid**  
   - **Endpoint**: `DELETE /bidding/delete/{id}`  
   - **Conditions**: Only the creator or an approver can delete.  

---

### Prerequisites  

- Java 11 or higher  
- Maven  

---

### Getting Started  

1. Clone the repository:  
   ```bash
   git clone https://github.com/your-username/tender-management-api.git  
   cd tender-management-api  
   ```  

2. Run the application:  
   ```bash
   mvn spring-boot:run  
   ```  

3. Test the application:  
   ```bash
   mvn clean test  
   ```  

4. Access the Swagger documentation at `/v3/api-docs`.  

---

### Technologies Used  

- **Spring Boot**: Backend framework for RESTful APIs.  
- **H2 Database**: In-memory database for testing.  
- **JWT**: Token-based authentication.  
- **Maven**: Dependency and build management.  

---

### Contributions  

Contributions are welcome! Please feel free to submit issues or pull requests to improve this project.  

If you'd like to support the development of this project, you can buy me a coffee:  
**GPay**: +91-9074023334  

Your support is greatly appreciated!  

---

**License**  
This project is licensed under the MIT License.
