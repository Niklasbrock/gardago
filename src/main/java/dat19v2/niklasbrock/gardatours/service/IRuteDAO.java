package dat19v2.niklasbrock.gardatours.service;

import dat19v2.niklasbrock.gardatours.model.Rute;

import java.util.List;

public interface IRuteDAO {
    public void insert();
    public void delete();
    public List<Rute> select();
}
