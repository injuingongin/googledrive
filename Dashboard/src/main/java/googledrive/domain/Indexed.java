package googledrive.domain;

import googledrive.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class Indexed extends AbstractEvent {

    private Long id;
    private Long filed;
    private String keywords;
}
