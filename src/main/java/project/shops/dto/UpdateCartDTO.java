package project.shops.dto;

import java.util.List;

public class UpdateCartDTO {
   private List<CartDTO> list;

    public List<CartDTO> getList() {
        return list;
    }
    public UpdateCartDTO() {
    }

    public void setList(List<CartDTO> list) {
        this.list = list;
    }

    public UpdateCartDTO(List<CartDTO> list) {
        this.list = list;
    }

}
