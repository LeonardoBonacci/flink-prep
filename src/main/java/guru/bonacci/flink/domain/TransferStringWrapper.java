package guru.bonacci.flink.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransferStringWrapper {
	
  private Transfer transfer;
  private String str;
}