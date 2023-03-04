package vsu.cs.tech.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;


//TODO SELECT FROM PLACE BY GEOCOORDINATES

/**
 * db.getCollection('place').find({location: {
 *     $geoIntersects: {
 *      $geometry: {
 *        type: "Point",
 *        coordinates: [
 *          1.6637,
 *          89.644
 *         ]
 *       }
 *     }
 *   }
 * })
 */
//TODO SELECT FROM INPLACE BY PLACESID

/**
 * db.getCollection('inPlace').find({"place_id": "63f9312e655c48033ed7d504"})
 */
//TODO SELECT FROM PERSON BY PERSON ID FROM PREVIEW QUERY
@Document
public class InPlace {

    private String _id;
    private String place_id;
    private String person_id;
    @Indexed(name = "ttl_index", expireAfterSeconds=20)
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDateTime time = LocalDateTime.now();

    @Version
    private Integer version;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getPlace_id() {
        return place_id;
    }

    public void setPlace_id(String place_id) {
        this.place_id = place_id;
    }

    public String getPerson_id() {
        return person_id;
    }

    public void setPerson_id(String person_id) {
        this.person_id = person_id;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

}
