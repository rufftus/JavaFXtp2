package com.lmdsio.projetbiblio.services;

import java.sql.*;

public class DbService {
    private Connection dbConn=null;

    protected void dbConnect() throws SQLException {
        String db="jdbc:mysql://" + "localhost:3306/ik_biblio";
        String dbUser="usersio";
        String dbPwd="sio";
        dbConn = DriverManager.getConnection(db, dbUser, dbPwd);
    }

    protected void dbClose()throws SQLException {
        dbConn.close();
    }

    protected ResultSet dbQuery (String sql, String param1, String param2) throws SQLException{
        PreparedStatement stmt = dbConn.prepareStatement(sql);
        if (param1 != null) stmt.setString(1, param1);
        if (param2 != null) stmt.setString(2, param2);
        return stmt.executeQuery();
    }

}
