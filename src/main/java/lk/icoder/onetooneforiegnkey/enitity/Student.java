package lk.icoder.onetooneforiegnkey.enitity;

import javax.persistence.*;

/**
 * @Project one-to-one-foriegnkey
 * @Author DILAN on 5/27/2018
 */
@Entity
public class Student extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;


}
