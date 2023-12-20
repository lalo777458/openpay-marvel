import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'valueOptionsPipe'
})
export class ValueOptionsPipePipe implements PipeTransform {

  transform = (objects: any[] = []) => {
    return Object.values(objects);
  }

}
