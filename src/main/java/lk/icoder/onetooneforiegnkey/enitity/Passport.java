package lk.icoder.onetooneforiegnkey.enitity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;

/**
 * @Project one-to-one-foriegnkey
 * @Author DILAN on 5/27/2018
 */
@Entity
public class Passport extends BaseEntity {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    private String number;
}
