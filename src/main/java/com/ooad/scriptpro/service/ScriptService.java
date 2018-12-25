package com.ooad.scriptpro.service;

import com.ooad.scriptpro.api.ScriptRepository;
import com.ooad.scriptpro.model.Script;
import com.ooad.scriptpro.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface ScriptService {
    Script findById(long id);
    Script findByScriptName(String scriptName);

    void save(Script script);

    void deleteScript(Script script);
    void deleteById(long id);
    void deleteByScriptName(String scriptName);

    List<User> getAuthors(Script script);

    List<Script> getTopFivePopular();
    List<Script> getTopFiveLatest();

    List<Script> vagueSearch(String query);

    String getScriptContentById(int id) throws IOException, SQLException, IOException, SQLException;

}
