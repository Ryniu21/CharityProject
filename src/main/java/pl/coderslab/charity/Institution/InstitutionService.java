package pl.coderslab.charity.Institution;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class InstitutionService {
    public final InstitutionRepository institutionRepository;

    public List<Institution> findAllInstitutions(){return institutionRepository.findAllInstitutions();}
}
