package com.enesakkal.communityapp.dtos;
import lombok.Data;
@Data
public class CreateCommunityDto {

    private String name;
    private String description;
    private boolean isPrivate;
    private String ownerId;

}