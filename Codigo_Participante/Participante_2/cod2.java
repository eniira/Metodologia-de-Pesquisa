private void ExcluirId implements excluir{
        private void excluir (int id) throws SQLException{
            try{
            Connection conn = null;
            Statement stmt = null;

            conn = ConnectionDAO.getInstance().getConnection();
            stmt = conn.createStatement();

            stmt.execute("DELETE FROM * WHERE id=" + String.valueOf(id));
        
        }finally{
            if((stmt != null) && !stmt.isClosed())
                stmt.close();
            if((conn != null) && !conn.isClosed())
                conn.close();
        }   
            
    }
}