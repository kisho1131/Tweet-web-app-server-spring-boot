# Tweet-web-app-server-spring-boot
 Backend Service for Tweet Application  (https://github.com/kisho1131/Tweet-web-app-client-angular)
<ul>
<li> POST /api/v1.0/tweets/register Register as new user </li>
<li>GET /api/v1.0/tweets/login Login</li>
<li>GET /api/v1.0/tweets/<username>/forgot Forgot password</li>
<li>GET /api/v1.0/tweets/all Get all tweets</li>
<li>GET /api/v1.0/tweets/users/all Get all users</li>
<li>GET /api/v/1.0/tweets/user/search/username* Search by username</li>
<li>GET /api/v1.0/tweets/username Get all tweets of user</li>
<li>POST /api/v1.0/tweets/<username>/add Post new tweet</li>
<li>PUT /api/v1.0/tweets/<username>/update/<id> Update tweet</li>
<li>DELETE /api/v1.0/tweets/<username>/delete/<id> Delete tweet</li>
<li>PUT /api/v1.0/tweets/<username>/like/<id> Like tweet</li>
<li>POST /api/v1.0/tweets/<username>/reply/<id> Reply to tweet</li>
</ul>

# Functional Requirements:
<li> Registration and Login -> As a user I should be able to login/Register in the tweet application </li>
<li> Post Tweet -> As a user I should be able to post a tweet </li>
<li> View and Reply -> Tweet As a user I should be able to view others tweet and reply to it. </li>
