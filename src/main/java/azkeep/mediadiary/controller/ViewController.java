package azkeep.mediadiary.controller;

import azkeep.mediadiary.dto.MediaRecordDto;
import azkeep.mediadiary.service.ViewService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/view")
@RequiredArgsConstructor
public class ViewController {
    private final ViewService viewService;

    @GetMapping("/recent")
    public ResponseEntity<MediaRecordDto> recent() {
        MediaRecordDto result = viewService.getRecent();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/last-week")
    public String lastWeek() {
        return "lastWeek";
    }

    @GetMapping("/last-month")
    public String lastMonth() {
        return "lastMonth";
    }
}
