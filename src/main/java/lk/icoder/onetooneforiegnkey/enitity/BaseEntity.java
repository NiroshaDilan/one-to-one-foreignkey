package lk.icoder.onetooneforiegnkey.enitity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

/**
 * @Project one-to-one-foriegnkey
 * @Author DILAN on 5/27/2018
 */
@MappedSuperclass
public class BaseEntity {

    @UpdateTimestamp
    private LocalDateTime lastUpdateDate;

    @CreationTimestamp
    private LocalDateTime createdDate;

    public BaseEntity() {
    }

    public BaseEntity(LocalDateTime lastUpdateDate, LocalDateTime createdDate) {
        this.lastUpdateDate = lastUpdateDate;
        this.createdDate = createdDate;
    }

    public LocalDateTime getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(LocalDateTime lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "lastUpdateDate=" + lastUpdateDate +
                ", createdDate=" + createdDate +
                '}';
    }
}
