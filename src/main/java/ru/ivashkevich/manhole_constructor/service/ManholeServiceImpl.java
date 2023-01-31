package ru.ivashkevich.manhole_constructor.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.ivashkevich.manhole_constructor.dao.ManholeEntity;
import ru.ivashkevich.manhole_constructor.dao.ManholeRepository;
import ru.ivashkevich.manhole_constructor.exception.ManholeNotFoundException;
import ru.ivashkevich.manhole_constructor.mapper.ManholeToEntityMapper;
import ru.ivashkevich.manhole_constructor.model.Manhole;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ManholeServiceImpl implements ManholeService {

    private final ManholeRepository manholeRepository;
    private final ManholeToEntityMapper mapper;

    @Override
    public Manhole getManholeById(String id) {
        ManholeEntity entity = manholeRepository.findById(id)
                .orElseThrow(() -> new ManholeNotFoundException("Manhole not found: id = " + id));
        return mapper.manholeEntityToManhole(entity);
    }

    @Override
    public List<Manhole> getAllManholes() {
        Iterable<ManholeEntity> manholeEntities = manholeRepository.findAll();

        List<Manhole> manholeList = new ArrayList<>();
        for (ManholeEntity manholeEntity : manholeEntities) {
            manholeList.add(mapper.manholeEntityToManhole(manholeEntity));
        }
        return manholeList;
    }

    @Override
    public void addManhole(Manhole manhole) {
        manholeRepository.save(mapper.manholeToManholeEntity(manhole));
    }
}
