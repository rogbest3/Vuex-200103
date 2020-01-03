package com.moneyhub.web.faq;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository											//FAQ 여기서 table 인식
public interface FAQRepository extends CrudRepository<FAQ, Long>{	

}
