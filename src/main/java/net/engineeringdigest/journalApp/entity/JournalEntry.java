package net.engineeringdigest.journalApp.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;

@Document("journal_entries")
@Data
@NoArgsConstructor
public class JournalEntry {

    @Id
    private ObjectId id;
    private LocalDateTime date;
    @NonNull
    private String title;
    private String content;


}
