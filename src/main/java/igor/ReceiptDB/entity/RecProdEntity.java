package igor.ReceiptDB.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
@Table(name = "rec_prod")
public class RecProdEntity implements Serializable {
  @Column(name = "product_count")
  private float productCount;

  @Column(name = "product_price")
  private float productPrice;
}
