package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.ettities.concretes.Candidate;

@Service
public interface CandidateService {
	DataResult <List<Candidate>>getAll();
	Result add(Candidate candidates);
}
