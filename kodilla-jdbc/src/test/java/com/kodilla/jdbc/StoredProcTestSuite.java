package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoredProcTestSuite {
    @Test
    public void testUpdateVipLevels() throws SQLException {
        // Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"Not set\"";
        ResultSet rs = statement.executeQuery(sqlCheckTable);

        // When
        Statement statement2 = dbManager.getConnection().createStatement();
        String sqlProcedureCall = "CALL UpdateVipLevels()";
        statement2.execute(sqlProcedureCall);

        // Then
        int howMany = -1;
        if (rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }
        assertEquals(0, howMany);
        rs.close();
        statement.close();
        statement2.close();
    }

    @Test
    public void testUpdateBestsellers() throws SQLException {
        // Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE BOOKS SET BESTSELLER = false";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM BOOKS WHERE BESTSELLER IS TRUE";
        String sqlCheckTable2 = "SELECT COUNT(*) AS HOW_MANY2 FROM BOOKS WHERE BESTSELLER IS TRUE";
        ResultSet rs1 = statement.executeQuery(sqlCheckTable);

        // When
        Statement statement2 = dbManager.getConnection().createStatement();
        String sqlProcedureCall = "CALL UpdateBestseller()";
        statement2.execute(sqlProcedureCall);
        ResultSet rs2 = statement2.executeQuery(sqlCheckTable2);

        // Then
        int howMany = -1;
        if (rs1.next()) {
            howMany = rs1.getInt("HOW_MANY");
        }
        int howMany2 = -1;
        if (rs2.next()) {
            howMany2 = rs2.getInt("HOW_MANY2");
        }
        assertEquals(0, howMany);
        assertEquals(2, howMany2);
        rs1.close();
        rs2.close();
        statement.close();
        statement2.close();

    }
}