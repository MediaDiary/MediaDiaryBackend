package azkeep.mediadiary.service;

import azkeep.mediadiary.dto.MediaRecordDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ViewServiceImpl implements ViewService {
    @Override
    public MediaRecordDto getRecent() {
        return null;
    }
}
