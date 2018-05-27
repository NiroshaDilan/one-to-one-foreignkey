package lk.icoder.onetooneforiegnkey.enitity;

import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;

/**
 * @Project one-to-one-foriegnkey
 * @Author DILAN on 5/27/2018
 */
@Entity
public class Review extends BaseEntity{

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    private String rating;
    private String description;
}
