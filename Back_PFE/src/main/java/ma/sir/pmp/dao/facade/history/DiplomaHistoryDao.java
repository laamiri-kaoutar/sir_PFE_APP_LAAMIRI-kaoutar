package ma.sir.pmp.dao.facade.history;

import ma.sir.pmp.zynerator.repository.AbstractHistoryRepository;
import ma.sir.pmp.bean.history.DiplomaHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface DiplomaHistoryDao extends AbstractHistoryRepository<DiplomaHistory,Long> {

}
