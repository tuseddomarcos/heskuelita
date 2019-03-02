package core.com.capgemini.heskuelita.service;

//Strategy

@FunctionalInterface
public interface ISearchService<T>{
	void Search(T args);
}
