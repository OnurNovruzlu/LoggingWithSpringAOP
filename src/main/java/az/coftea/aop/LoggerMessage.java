package az.coftea.aop;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoggerMessage {
    private String className;
    private String methodName;
    private String methodArgs;
    private long elapsedTimeInMillis;
    private long elapsedTimeInMicros;
    private Object result;

    @SneakyThrows
    @Override
    public String toString() {
        return "{" +
                "className='" + className + '\'' +
                ", methodName='" + methodName + '\'' +
                ", methodArgs='" + methodArgs + '\'' +
                ", elapsedTimeInMillis=" + elapsedTimeInMillis +
                ", elapsedTimeInMicros=" + elapsedTimeInMicros +
                ", result=" + new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(this.result) +
                '}';
    }
}
