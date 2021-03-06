package repos;

import java.util.List;



public interface IRepository<TEntity> {

	public void save(TEntity entity);
	public void updata(TEntity entity);
	public void delete(TEntity entity);
	public TEntity get(int id);
	public List<TEntity> getAll();
}
