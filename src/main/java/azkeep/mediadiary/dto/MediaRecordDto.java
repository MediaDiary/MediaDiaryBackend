package azkeep.mediadiary.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MediaRecordDto {
    private Long id;
    private String title;
    private Date date;
    private Boolean isFinished;
    private String type;
    private String genre;
}
