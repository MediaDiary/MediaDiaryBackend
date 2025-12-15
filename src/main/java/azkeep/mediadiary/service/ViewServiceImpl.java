package azkeep.mediadiary.service;

import azkeep.mediadiary.dto.MediaSelectedDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ViewServiceImpl implements ViewService {
    @Override
    public MediaSelectedDto getRecent() {
        MediaSelectedDto dto = new MediaSelectedDto();
        var result = dto.map(m -> MediaSelectedDto.builder()
                .id(m.getId()
                )

        );
        return null;
    }
}
